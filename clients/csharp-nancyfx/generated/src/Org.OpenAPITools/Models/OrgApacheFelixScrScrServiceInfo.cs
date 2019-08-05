using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixScrScrServiceInfo
    /// </summary>
    public sealed class OrgApacheFelixScrScrServiceInfo:  IEquatable<OrgApacheFelixScrScrServiceInfo>
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
        public OrgApacheFelixScrScrServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixScrScrServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixScrScrServiceInfo()
        {
        }

        private OrgApacheFelixScrScrServiceInfo(string Pid, string Title, string Description, OrgApacheFelixScrScrServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixScrScrServiceInfo.
        /// </summary>
        /// <returns>OrgApacheFelixScrScrServiceInfoBuilder</returns>
        public static OrgApacheFelixScrScrServiceInfoBuilder Builder()
        {
            return new OrgApacheFelixScrScrServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixScrScrServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixScrScrServiceInfoBuilder</returns>
        public OrgApacheFelixScrScrServiceInfoBuilder With()
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

        public bool Equals(OrgApacheFelixScrScrServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixScrScrServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixScrScrServiceInfo</param>
        /// <param name="right">Compared (OrgApacheFelixScrScrServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixScrScrServiceInfo left, OrgApacheFelixScrScrServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixScrScrServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixScrScrServiceInfo</param>
        /// <param name="right">Compared (OrgApacheFelixScrScrServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixScrScrServiceInfo left, OrgApacheFelixScrScrServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixScrScrServiceInfo.
        /// </summary>
        public sealed class OrgApacheFelixScrScrServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixScrScrServiceProperties _Properties;

            internal OrgApacheFelixScrScrServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixScrScrServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixScrScrServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixScrScrServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixScrScrServiceInfoBuilder Properties(OrgApacheFelixScrScrServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixScrScrServiceInfo.
            /// </summary>
            /// <returns>OrgApacheFelixScrScrServiceInfo</returns>
            public OrgApacheFelixScrScrServiceInfo Build()
            {
                Validate();
                return new OrgApacheFelixScrScrServiceInfo(
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