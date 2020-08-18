/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import React, { useState } from "react";

import '../css/main.scss';

const CssCustomPropertiesSample = () => {
  const [fade, setFade] = useState(false);
  const [collapse, setCollapse] = useState(false);

  return (
    <div className="ccp">
      <div className="container">
        <div className="row">
          <div className="col">
            <h1>CSS Custom Properties</h1>
          </div>
        </div>

        <div className="row">
          <div className="ccp-group ccp-group-colors col-12">
            <h2> Colors</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample bg-white"></span>
                <span className="ccp-label">white</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-100"></span>
                <span className="ccp-label">gray-100</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-200"></span>
                <span className="ccp-label">gray-200</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-300"></span>
                <span className="ccp-label">gray-300</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-400"></span>
                <span className="ccp-label">gray-400</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-500"></span>
                <span className="ccp-label">gray-500</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-600"></span>
                <span className="ccp-label">gray-600</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-700"></span>
                <span className="ccp-label">gray-700</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-800"></span>
                <span className="ccp-label">gray-800</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-900"></span>
                <span className="ccp-label">gray-900</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-black"></span>
                <span className="ccp-label">black</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-transparent"></span>
                <span className="ccp-label">transparent</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-colors col-12">
            <h2>Theme Colors</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample bg-primary"></span>
                <span className="ccp-label">primary</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-secondary"></span>
                <span className="ccp-label">secondary</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-success"></span>
                <span className="ccp-label">success</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-info"></span>
                <span className="ccp-label">info</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-warning"></span>
                <span className="ccp-label">warning</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-danger"></span>
                <span className="ccp-label">danger</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-light"></span>
                <span className="ccp-label">light</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-lighter"></span>
                <span className="ccp-label">lighter</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-gray-dark"></span>
                <span className="ccp-label">gray-dark</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample bg-dark"></span>
                <span className="ccp-label">dark</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-space col-md-4">
            <h2>Spacers</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample pr-1"></span>
                <span className="ccp-label">space-1</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-2"></span>
                <span className="ccp-label">space-2</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-3"></span>
                <span className="ccp-label">space-3</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-4"></span>
                <span className="ccp-label">space-4</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-5"></span>
                <span className="ccp-label">space-5</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-6"></span>
                <span className="ccp-label">space-6</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-7"></span>
                <span className="ccp-label">space-7</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-8"></span>
                <span className="ccp-label">space-8</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-9"></span>
                <span className="ccp-label">space-9</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample pr-10"></span>
                <span className="ccp-label">space-10</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-rounded col-md-4">
            <h2>Border Radius</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample rounded-sm"></span>
                <span className="ccp-label">border-radius-sm</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample rounded"></span>
                <span className="ccp-label">border-radius</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample rounded-lg"></span>
                <span className="ccp-label">border-radius-lg</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample rounded-pill"></span>
                <span className="ccp-label">rounded-pill</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample rounded-circle"></span>
                <span className="ccp-label">border-radius-circle</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-shadow col-md-4">
            <h2>Shadows</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample shadow-sm"></span>
                <span className="ccp-label">shadow-sm</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample shadow"></span>
                <span className="ccp-label">shadow</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample shadow-lg"></span>
                <span className="ccp-label">shadow-lg</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-font col-md-4">
            <h2>Font Family</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-labels">font-family-sans-serif</span>
                <span className="ccp-sample font-family-sans-serif">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-family-monospace</span>
                <span className="ccp-sample font-family-monospace">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-family-base</span>
                <span className="ccp-sample font-family-base">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-font col-md-4">
            <h2>Font Weight</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-lighter</span>
                <span className="ccp-sample font-weight-lighter">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>{" "}
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-light</span>
                <span className="ccp-sample font-weight-light">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-normal</span>
                <span className="ccp-sample font-weight-normal">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-semi-bold</span>
                <span className="ccp-sample font-weight-semi-bold">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-bold</span>
                <span className="ccp-sample font-weight-bold">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-labels">font-weight-bolder</span>
                <span className="ccp-sample font-weight-bolder">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-font col-md-4">
            <h2>Headings</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-label">h1</span>
                <span className="ccp-sample h1">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">h2</span>
                <span className="ccp-sample h2">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">h3</span>
                <span className="ccp-sample h3">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">h4</span>
                <span className="ccp-sample h4">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">h5</span>
                <span className="ccp-sample h5">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">h6</span>
                <span className="ccp-sample h6">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-font col-12">
            <h2>Display</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-label">display-1</span>
                <span className="ccp-sample display-1">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">display-2</span>
                <span className="ccp-sample display-2">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">display-3</span>
                <span className="ccp-sample display-3">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">display-4</span>
                <span className="ccp-sample display-4">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-aspect col-md-4">
            <h2>Aspect Ratio</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample">
                  <span className="aspect-ratio"></span>
                </span>
                <span className="ccp-label">1:1</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample">
                  <span className="aspect-ratio aspect-ratio-16-to-9"></span>
                </span>
                <span className="ccp-label">16:9</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample">
                  <span className="aspect-ratio aspect-ratio-8-to-3"></span>
                </span>
                <span className="ccp-label">8:3</span>
              </div>
              <div className="ccp-item">
                <span className="ccp-sample">
                  <span className="aspect-ratio aspect-ratio-4-to-3"></span>
                </span>
                <span className="ccp-label">4:3</span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-transition col-md-4">
            <h2>Transition</h2>
            <div className="ccp-items">
              <label className="ccp-item">
                <span className="ccp-sample">
                  <span
                    className={"fade" + (fade ? "" : " show")}
                  ></span>
                </span>
                <span className="ccp-label">transition-fade</span>
                <input
                  type="checkbox"
                  value={fade}
                  onChange={() => setFade(!fade)}
                />
              </label>
            </div>
            <div className="ccp-items">
              <label className="ccp-item">
                <span className="ccp-sample">
                  <span
                    className={"collapsing" + (collapse ? "" : " show")}
                  ></span>
                </span>
                <span className="ccp-label">transition-collapse</span>
                <input
                  type="checkbox"
                  value={collapse}
                  onChange={() => setCollapse(!collapse)}
                />
              </label>
            </div>
          </div>

          <div className="ccp-group ccp-group-font col-md-4">
            <h2>Text</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-label">lead</span>
                <span className="ccp-sample lead">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">muted</span>
                <span className="ccp-sample text-muted">
                  The quick brown fox jumps over the lazy dog
                </span>
              </div>
              <div className="ccp-item">
                <span className="ccp-label">blockquote</span>
                <span className="ccp-sample">
                  <span className="blockquote">
                    The quick brown fox jumps over the lazy dog
                  </span>
                  <span className="blockquote-footer">Liferay</span>
                </span>
              </div>
            </div>
          </div>

          <div className="ccp-group ccp-group-separator col-12">
            <h2>Separator</h2>
            <div className="ccp-items">
              <div className="ccp-item">
                <span className="ccp-sample">
                  <hr />
                </span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default CssCustomPropertiesSample;
