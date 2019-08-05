using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixHttpSslfilterSslFilterInfo
    /// </summary>
    public sealed class OrgApacheFelixHttpSslfilterSslFilterInfo:  IEquatable<OrgApacheFelixHttpSslfilterSslFilterInfo>
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
        public OrgApacheFelixHttpSslfilterSslFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixHttpSslfilterSslFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixHttpSslfilterSslFilterInfo()
        {
        }

        private OrgApacheFelixHttpSslfilterSslFilterInfo(string Pid, string Title, string Description, OrgApacheFelixHttpSslfilterSslFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixHttpSslfilterSslFilterInfo.
        /// </summary>
        /// <returns>OrgApacheFelixHttpSslfilterSslFilterInfoBuilder</returns>
        public static OrgApacheFelixHttpSslfilterSslFilterInfoBuilder Builder()
        {
            return new OrgApacheFelixHttpSslfilterSslFilterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixHttpSslfilterSslFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixHttpSslfilterSslFilterInfoBuilder</returns>
        public OrgApacheFelixHttpSslfilterSslFilterInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixHttpSslfilterSslFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixHttpSslfilterSslFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpSslfilterSslFilterInfo</param>
        /// <param name="right">Compared (OrgApacheFelixHttpSslfilterSslFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixHttpSslfilterSslFilterInfo left, OrgApacheFelixHttpSslfilterSslFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixHttpSslfilterSslFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpSslfilterSslFilterInfo</param>
        /// <param name="right">Compared (OrgApacheFelixHttpSslfilterSslFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixHttpSslfilterSslFilterInfo left, OrgApacheFelixHttpSslfilterSslFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixHttpSslfilterSslFilterInfo.
        /// </summary>
        public sealed class OrgApacheFelixHttpSslfilterSslFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixHttpSslfilterSslFilterProperties _Properties;

            internal OrgApacheFelixHttpSslfilterSslFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixHttpSslfilterSslFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixHttpSslfilterSslFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixHttpSslfilterSslFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixHttpSslfilterSslFilterInfoBuilder Properties(OrgApacheFelixHttpSslfilterSslFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixHttpSslfilterSslFilterInfo.
            /// </summary>
            /// <returns>OrgApacheFelixHttpSslfilterSslFilterInfo</returns>
            public OrgApacheFelixHttpSslfilterSslFilterInfo Build()
            {
                Validate();
                return new OrgApacheFelixHttpSslfilterSslFilterInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}