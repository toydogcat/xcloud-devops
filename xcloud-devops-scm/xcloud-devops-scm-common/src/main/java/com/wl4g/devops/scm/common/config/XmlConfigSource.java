package com.wl4g.devops.scm.common.config;

import static com.wl4g.components.common.serialize.JacksonUtils.toJSONString;

import java.util.List;
import java.util.Map;

import com.wl4g.devops.scm.common.model.AbstractConfigInfo.ConfigProfile;

import lombok.Getter;
import lombok.Setter;

/**
 * {@link XmlConfigSource}
 * 
 * @author Wangl.sir &lt;wanglsir@gmail.com, 983708408@qq.com&gt;
 * @version 2020-08-15
 * @sine v1.0.0
 * @see
 */
@Getter
public class XmlConfigSource extends AbstractConfigSource {

	private static final long serialVersionUID = -7806121596630535330L;

	@Override
	public void doRead(ConfigProfile profile, String sourceContent) {
		throw new UnsupportedOperationException();
	}

	/** Configuration source typeof map */
	private XmlNode root;

	/**
	 * {@link XmlNode}
	 * 
	 * @see
	 */
	@Getter
	@Setter
	public static class XmlNode {

		/** Xml node name. */
		private String name;

		/** Xml node attributes. */
		private Map<String, String> attributes;

		/** Xml children nodes. */
		private List<XmlNode> children;

		@Override
		public String toString() {
			return getClass().getSimpleName().concat(" - ").concat(toJSONString(this));
		}

	}

}
