/**
 * Copyright (C) 2011, FuseSource Corp.  All rights reserved.
 * http://fusesource.com
 *
 * The software in this package is published under the terms of the
 * CDDL license a copy of which has been included with this distribution
 * in the license.txt file.
 */
package org.fusesource.fabric.api;

import org.fusesource.fabric.api.data.BundleInfo;
import org.fusesource.fabric.api.data.ServiceInfo;

public interface Agent {

    String getId();

    Agent getParent();

    boolean isAlive();

    // Runtime informations
    boolean isRoot();
    String getSshUrl();
    String getJmxUrl();

    BundleInfo[] getBundles();
    ServiceInfo[] getServices();

    Profile[] getProfiles();
    void setProfiles(Profile[] profiles);

    String getLocation();
    void setLocation(String location);

    void start();
    void stop();
    void destroy();

}
