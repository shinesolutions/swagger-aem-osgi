using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo:  IEquatable<OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo>
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
        public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties Properties { get; private set; }

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
        /// Use OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo()
        {
        }

        private OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder</returns>
        public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo left, OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo left, OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder Properties(OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo</returns>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo(
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