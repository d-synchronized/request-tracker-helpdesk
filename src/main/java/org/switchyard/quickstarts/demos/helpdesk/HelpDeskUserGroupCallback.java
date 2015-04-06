package org.switchyard.quickstarts.demos.helpdesk;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.switchyard.component.bpm.runtime.BPMUserGroupCallback;

/**
 * @author David Ward &lt;<a href="mailto:dward@jboss.org">dward@jboss.org</a>&gt; &copy; 2013 Red Hat Inc.
 */
public final class HelpDeskUserGroupCallback extends BPMUserGroupCallback {

    public static final Map<String,List<String>> USERS_GROUPS;
    static {
        Map<String,List<String>> ugm = new LinkedHashMap<String,List<String>>();
        ugm.put("krisv", Arrays.asList(new String[] {"developers"}));
        ugm.put("david", Arrays.asList(new String[] {"users"}));
        USERS_GROUPS = Collections.unmodifiableMap(ugm);
    }

    private static final Properties USERS_GROUPS_PROPERTIES = new Properties();
    static {
        USERS_GROUPS_PROPERTIES.setProperty("Administrator", "users,developers");
        USERS_GROUPS_PROPERTIES.setProperty("david", "users");
        USERS_GROUPS_PROPERTIES.setProperty("krisv", "developers");
    }

    public HelpDeskUserGroupCallback() {
        super(USERS_GROUPS_PROPERTIES);
    }

}
