using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo:  IEquatable<OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo>
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
        public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo()
        {
        }

        private OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder</returns>
        public static OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder</returns>
        public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo left, OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo left, OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder Properties(OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo</returns>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo(
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