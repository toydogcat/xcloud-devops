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
package com.wl4g.devops.ci.service;

import com.wl4g.components.core.bean.ci.Orchestration;
import com.wl4g.devops.page.PageModel;

/**
 * @author vjay
 * @date 2019-11-12 11:05:00
 */
public interface OrchestrationService {

	PageModel list(PageModel pm, String name);

	void save(Orchestration orchestration);

	void del(Long id);

	Orchestration detail(Long id);

	void run(Long id, String remark, String taskTraceId, String taskTraceType, String annex);

}