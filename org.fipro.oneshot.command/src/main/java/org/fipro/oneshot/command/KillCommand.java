package org.fipro.oneshot.command;

import org.fipro.oneshot.OneShot;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

@Component(
    property= {
        "osgi.command.scope=fipro",
        "osgi.command.function=kill"},
    service=KillCommand.class
)
public class KillCommand {

	@Reference(scope=ReferenceScope.PROTOTYPE_REQUIRED)
    private OneShot killer;

    @Activate
    void activate() {
    	System.out.println(
    			getClass().getSimpleName() + " activated");
    }
    
    @Deactivate
    void deactivate() {
    	System.out.println(
    			getClass().getSimpleName() + " activated");
    }

    public void kill(String target) {
        killer.shoot(target);
    }
}