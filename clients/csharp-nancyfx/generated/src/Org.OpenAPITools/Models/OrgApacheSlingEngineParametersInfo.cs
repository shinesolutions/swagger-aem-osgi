using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineParametersInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineParametersInfo:  IEquatable<OrgApacheSlingEngineParametersInfo>
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
        public OrgApacheSlingEngineParametersProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingEngineParametersInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineParametersInfo()
        {
        }

        private OrgApacheSlingEngineParametersInfo(string Pid, string Title, string Description, OrgApacheSlingEngineParametersProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineParametersInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineParametersInfoBuilder</returns>
        public static OrgApacheSlingEngineParametersInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineParametersInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineParametersInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineParametersInfoBuilder</returns>
        public OrgApacheSlingEngineParametersInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineParametersInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineParametersInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineParametersInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineParametersInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineParametersInfo left, OrgApacheSlingEngineParametersInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineParametersInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineParametersInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineParametersInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineParametersInfo left, OrgApacheSlingEngineParametersInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineParametersInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineParametersInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineParametersProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingEngineParametersInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineParametersInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineParametersInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineParametersInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineParametersInfoBuilder Properties(OrgApacheSlingEngineParametersProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingEngineParametersInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingEngineParametersInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineParametersInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineParametersInfo</returns>
            public OrgApacheSlingEngineParametersInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineParametersInfo(
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