using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixJaasConfigurationSpiInfo
    /// </summary>
    public sealed class OrgApacheFelixJaasConfigurationSpiInfo:  IEquatable<OrgApacheFelixJaasConfigurationSpiInfo>
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
        public OrgApacheFelixJaasConfigurationSpiProperties Properties { get; private set; }

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
        /// Use OrgApacheFelixJaasConfigurationSpiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixJaasConfigurationSpiInfo()
        {
        }

        private OrgApacheFelixJaasConfigurationSpiInfo(string Pid, string Title, string Description, OrgApacheFelixJaasConfigurationSpiProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixJaasConfigurationSpiInfo.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationSpiInfoBuilder</returns>
        public static OrgApacheFelixJaasConfigurationSpiInfoBuilder Builder()
        {
            return new OrgApacheFelixJaasConfigurationSpiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixJaasConfigurationSpiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationSpiInfoBuilder</returns>
        public OrgApacheFelixJaasConfigurationSpiInfoBuilder With()
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

        public bool Equals(OrgApacheFelixJaasConfigurationSpiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixJaasConfigurationSpiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationSpiInfo</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationSpiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixJaasConfigurationSpiInfo left, OrgApacheFelixJaasConfigurationSpiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixJaasConfigurationSpiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationSpiInfo</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationSpiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixJaasConfigurationSpiInfo left, OrgApacheFelixJaasConfigurationSpiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixJaasConfigurationSpiInfo.
        /// </summary>
        public sealed class OrgApacheFelixJaasConfigurationSpiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixJaasConfigurationSpiProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheFelixJaasConfigurationSpiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder Properties(OrgApacheFelixJaasConfigurationSpiProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheFelixJaasConfigurationSpiInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixJaasConfigurationSpiInfo.
            /// </summary>
            /// <returns>OrgApacheFelixJaasConfigurationSpiInfo</returns>
            public OrgApacheFelixJaasConfigurationSpiInfo Build()
            {
                Validate();
                return new OrgApacheFelixJaasConfigurationSpiInfo(
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