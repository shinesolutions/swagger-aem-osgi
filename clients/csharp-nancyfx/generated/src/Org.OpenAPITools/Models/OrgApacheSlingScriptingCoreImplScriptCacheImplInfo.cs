using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingCoreImplScriptCacheImplInfo
    /// </summary>
    public sealed class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo:  IEquatable<OrgApacheSlingScriptingCoreImplScriptCacheImplInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo()
        {
        }

        private OrgApacheSlingScriptingCoreImplScriptCacheImplInfo(string Pid, string Title, string Description, OrgApacheSlingScriptingCoreImplScriptCacheImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder</returns>
        public static OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder Builder()
        {
            return new OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder</returns>
        public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingCoreImplScriptCacheImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo left, OrgApacheSlingScriptingCoreImplScriptCacheImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo left, OrgApacheSlingScriptingCoreImplScriptCacheImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingScriptingCoreImplScriptCacheImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder Properties(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingCoreImplScriptCacheImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplInfo</returns>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingScriptingCoreImplScriptCacheImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}