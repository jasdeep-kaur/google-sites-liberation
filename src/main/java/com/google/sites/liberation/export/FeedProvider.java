/*
 * Copyright (C) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.sites.liberation.export;

import com.google.gdata.client.sites.SitesService;
import com.google.gdata.data.sites.BaseContentEntry;
import com.google.inject.ImplementedBy;

import java.net.URL;

/**
 * Provides an Iterable of BaseContentEntry's, for a given feed URL and 
 * SitesService. 
 * 
 * @author bsimon@google.com (Benjamin Simon)
 */
@ImplementedBy(FeedProviderImpl.class)
public interface FeedProvider {

  /**
   * Returns an Iterable of the entries at the given feed URL, using the given
   * SitesService.
   */
  Iterable<BaseContentEntry<?>> getEntries(URL feedUrl, 
      SitesService sitesService);
}
