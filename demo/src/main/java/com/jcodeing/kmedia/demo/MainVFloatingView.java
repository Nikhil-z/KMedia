/*
 * Copyright (c) 2017 K Sun <jcodeing@gmail.com>
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
package com.jcodeing.kmedia.demo;

import android.content.Context;
import android.util.AttributeSet;
import com.jcodeing.kmedia.window.VideoFloatingWindowView;

public class MainVFloatingView extends VideoFloatingWindowView {

  public MainVFloatingView(Context context) {
    super(context);
  }

  public MainVFloatingView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MainVFloatingView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected int getDefaultLayoutId() {
    return R.layout.floating_video_view_main;
  }

  //Do something ...
}
