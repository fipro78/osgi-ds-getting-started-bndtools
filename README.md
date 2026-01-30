# OSGi - Getting Started with OSGi Declarative Services (Bndtools)

This project contains the projects for the OSGi Declarative Services Tutorials.

It contains the projects in Bndtools format.

The tutorials that explain the contents of this repository are:
<ul>
<li><a href="https://vogella.com/blog/getting-started-with-osgi-declarative-services-2024/">Getting Started with OSGi Declarative Services</a></li>
<li><a href="https://vogella.com/blog/osgi-component-testing-2024/">OSGi Component Testing</a></li>
<li><a href="https://vogella.com/blog/configuring-osgi-declarative-services-2024/">Configuring OSGi Declarative Services</a></li>
<li><a href="https://vogella.com/blog/control-osgi-ds-component-instances-2024/">Control OSGi DS Component Instances</a></li>
<li><a href="https://vogella.com/blog/access-osgi-services-via-web-interface-2024/">Access OSGi Services via web interface</a></li>
<li><a href="https://vogella.com/blog/osgi-event-admin-publish-subscribe-2024/">OSGi Event Admin - Publish and Subscribe</a></li>
</ul>

## Note

This repository currently contains a state where the `kill` command in the _org.fipro.oneshot.command_ bundle is not working when using the _launch.bndrun_ or the _launch_equinox.bndrun_ are used to launch the runtime.

The reason is probably [FELIX-6726](https://issues.apache.org/jira/browse/FELIX-6726) since Felix SCR 2.2.10. If you use Felix SCR 2.2.6 there is no issue with the `kill` command.

To show the error, the `KillCommand` implementation was modified to use the `ReferenceScope.PROTOTYPE_REQUIRED`, which leads to a deactivation of the `Hitman` instance after the `kill` command was executed.

```java
public class KillCommand {

	@Reference(scope=ReferenceScope.PROTOTYPE_REQUIRED)
    private OneShot killer;
```
