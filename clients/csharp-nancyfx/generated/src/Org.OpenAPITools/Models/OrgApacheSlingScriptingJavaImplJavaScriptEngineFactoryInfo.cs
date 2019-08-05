using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo:  IEquatable<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo>
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
        public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo()
        {
        }

        private OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder</returns>
        public static OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder</returns>
        public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo left, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo left, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder Properties(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo</returns>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo(
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