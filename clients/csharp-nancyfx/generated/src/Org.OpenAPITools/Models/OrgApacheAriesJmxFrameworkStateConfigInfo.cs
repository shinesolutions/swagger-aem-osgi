using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheAriesJmxFrameworkStateConfigInfo
    /// </summary>
    public sealed class OrgApacheAriesJmxFrameworkStateConfigInfo:  IEquatable<OrgApacheAriesJmxFrameworkStateConfigInfo>
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
        public OrgApacheAriesJmxFrameworkStateConfigProperties Properties { get; private set; }

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
        /// Use OrgApacheAriesJmxFrameworkStateConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheAriesJmxFrameworkStateConfigInfo()
        {
        }

        private OrgApacheAriesJmxFrameworkStateConfigInfo(string Pid, string Title, string Description, OrgApacheAriesJmxFrameworkStateConfigProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheAriesJmxFrameworkStateConfigInfo.
        /// </summary>
        /// <returns>OrgApacheAriesJmxFrameworkStateConfigInfoBuilder</returns>
        public static OrgApacheAriesJmxFrameworkStateConfigInfoBuilder Builder()
        {
            return new OrgApacheAriesJmxFrameworkStateConfigInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheAriesJmxFrameworkStateConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheAriesJmxFrameworkStateConfigInfoBuilder</returns>
        public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder With()
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

        public bool Equals(OrgApacheAriesJmxFrameworkStateConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheAriesJmxFrameworkStateConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheAriesJmxFrameworkStateConfigInfo</param>
        /// <param name="right">Compared (OrgApacheAriesJmxFrameworkStateConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheAriesJmxFrameworkStateConfigInfo left, OrgApacheAriesJmxFrameworkStateConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheAriesJmxFrameworkStateConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheAriesJmxFrameworkStateConfigInfo</param>
        /// <param name="right">Compared (OrgApacheAriesJmxFrameworkStateConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheAriesJmxFrameworkStateConfigInfo left, OrgApacheAriesJmxFrameworkStateConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheAriesJmxFrameworkStateConfigInfo.
        /// </summary>
        public sealed class OrgApacheAriesJmxFrameworkStateConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheAriesJmxFrameworkStateConfigProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheAriesJmxFrameworkStateConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder Properties(OrgApacheAriesJmxFrameworkStateConfigProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheAriesJmxFrameworkStateConfigInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheAriesJmxFrameworkStateConfigInfo.
            /// </summary>
            /// <returns>OrgApacheAriesJmxFrameworkStateConfigInfo</returns>
            public OrgApacheAriesJmxFrameworkStateConfigInfo Build()
            {
                Validate();
                return new OrgApacheAriesJmxFrameworkStateConfigInfo(
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