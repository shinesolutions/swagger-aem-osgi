using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo:  IEquatable<OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo>
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
        public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties Properties { get; private set; }

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
        /// Use OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo()
        {
        }

        private OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder</returns>
        public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo left, OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo left, OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder Properties(OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</returns>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo(
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