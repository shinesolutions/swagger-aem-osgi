using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadySystemReadyMonitorInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadySystemReadyMonitorInfo:  IEquatable<OrgApacheFelixSystemreadySystemReadyMonitorInfo>
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
        public OrgApacheFelixSystemreadySystemReadyMonitorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadySystemReadyMonitorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadySystemReadyMonitorInfo()
        {
        }

        private OrgApacheFelixSystemreadySystemReadyMonitorInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadySystemReadyMonitorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadySystemReadyMonitorInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder</returns>
        public static OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder</returns>
        public OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadySystemReadyMonitorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadySystemReadyMonitorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadySystemReadyMonitorInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadySystemReadyMonitorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadySystemReadyMonitorInfo left, OrgApacheFelixSystemreadySystemReadyMonitorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadySystemReadyMonitorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadySystemReadyMonitorInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadySystemReadyMonitorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadySystemReadyMonitorInfo left, OrgApacheFelixSystemreadySystemReadyMonitorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadySystemReadyMonitorInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadySystemReadyMonitorProperties _Properties;

            internal OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadySystemReadyMonitorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadySystemReadyMonitorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadySystemReadyMonitorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadySystemReadyMonitorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadySystemReadyMonitorInfoBuilder Properties(OrgApacheFelixSystemreadySystemReadyMonitorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadySystemReadyMonitorInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorInfo</returns>
            public OrgApacheFelixSystemreadySystemReadyMonitorInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadySystemReadyMonitorInfo(
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