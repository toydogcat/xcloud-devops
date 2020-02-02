/*
 * Copyright 2017 ~ 2025 the original author or authors. <wanglsir@gmail.com, 983708408@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wl4g.devops.shell.message;

import static com.wl4g.devops.shell.message.ChannelState.*;
import static com.wl4g.devops.tool.common.lang.Assert2.*;

/**
 * Result output message.
 * 
 * @author Wangl.sir <983708408@qq.com>
 * @version v1.0 2019年5月4日
 * @since
 */
public class OutputMessage extends Message {
	private static final long serialVersionUID = -8574311246731909685L;

	final private ChannelState state;

	final private String content;

	public OutputMessage(String content) {
		this(NEW, content);
	}

	public OutputMessage(ChannelState state, String content) {
		notNull(state, "State must not be empty");
		this.state = state;
		this.content = content;
	}

	public ChannelState getState() {
		return state;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Output [" + state + " - " + content + "]";
	}

}