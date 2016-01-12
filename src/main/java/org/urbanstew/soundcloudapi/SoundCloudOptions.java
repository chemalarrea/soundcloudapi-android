/*
 *  Copyright 2009 urbanSTEW
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.urbanstew.soundcloudapi;

import org.urbanstew.soundcloudapi.SoundCloudAPI.OAuthVersion;
import org.urbanstew.soundcloudapi.SoundCloudAPI.SoundCloudSystem;

public class SoundCloudOptions
{
	public SoundCloudOptions()
	{}
	
	public SoundCloudOptions(SoundCloudSystem system)
	{
		this.system = system;
	}
	
	public SoundCloudOptions(SoundCloudSystem system, OAuthVersion version)
	{
		this.system = system;
		this.version = version;
	}
	
	public SoundCloudOptions with(OAuthVersion newVersion)
	{	return new SoundCloudOptions(system, newVersion); }
	
	public SoundCloudOptions with(SoundCloudSystem newSystem)
	{	return new SoundCloudOptions(newSystem, version); }

	public OAuthVersion version = OAuthVersion.V1_0_A;
	public SoundCloudSystem system = SoundCloudSystem.PRODUCTION;
}
