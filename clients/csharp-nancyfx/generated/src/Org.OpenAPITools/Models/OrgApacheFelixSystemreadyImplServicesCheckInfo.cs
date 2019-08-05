using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServicesCheckInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServicesCheckInfo:  IEquatable<OrgApacheFelixSystemreadyImplServicesCheckInfo>
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
        public OrgApacheFelixSystemreadyImplServicesCheckProperties Properties { get; private set; }

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
        /// Use OrgApacheFelixSystemreadyImplServicesCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServicesCheckInfo()
        {
        }

        private OrgApacheFelixSystemreadyImplServicesCheckInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadyImplServicesCheckProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServicesCheckInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder</returns>
        public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplServicesCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServicesCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServicesCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServicesCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServicesCheckInfo left, OrgApacheFelixSystemreadyImplServicesCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServicesCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServicesCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServicesCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServicesCheckInfo left, OrgApacheFelixSystemreadyImplServicesCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServicesCheckInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadyImplServicesCheckProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder Properties(OrgApacheFelixSystemreadyImplServicesCheckProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheFelixSystemreadyImplServicesCheckInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServicesCheckInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServicesCheckInfo</returns>
            public OrgApacheFelixSystemreadyImplServicesCheckInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServicesCheckInfo(
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