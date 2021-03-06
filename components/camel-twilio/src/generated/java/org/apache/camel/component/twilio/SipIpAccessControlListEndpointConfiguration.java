
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.IpAccessControlList
 */
@ApiParams(apiName = "sip-ip-access-control-list", apiMethods = "creator,deleter,fetcher,reader,updater")
@UriParams
@Configurer
public final class SipIpAccessControlListEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "A human readable description of this resource")
    private String friendlyName;
    @UriParam(description = "The unique sid that identifies this account")
    private String pathAccountSid;
    @UriParam(description = "A string that identifies the resource to delete")
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
