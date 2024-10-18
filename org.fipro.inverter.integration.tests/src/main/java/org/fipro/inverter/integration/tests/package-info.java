// we require a StringInverter service to test
@Requirement(
		namespace = ServiceNamespace.SERVICE_NAMESPACE, 
		filter = "(" + ServiceNamespace.CAPABILITY_OBJECTCLASS_ATTRIBUTE + "=org.fipro.inverter.StringInverter)")
package org.fipro.inverter.integration.tests;

import org.osgi.annotation.bundle.Requirement;
import org.osgi.namespace.service.ServiceNamespace;