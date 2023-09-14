/*
 * Copyright 2011-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mongodb.repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to declare read preference for repository and query.
 *
 * @author Jorge Rodríguez
 * @since 4.2
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Documented
public @interface ReadPreference {

	/**
	 * Configure read preference mode
	 * @return read preference mode
	 */
	String value() default "";

	/**
	 * Set read preference tags
	 * @return read preference tags
	 */
	ReadPreferenceTag[] tags() default {};

	/**
	 * Set read preference maxStalenessSeconds
	 * @return read preference maxStalenessSeconds
	 */
	long maxStalenessSeconds() default -1;
}

