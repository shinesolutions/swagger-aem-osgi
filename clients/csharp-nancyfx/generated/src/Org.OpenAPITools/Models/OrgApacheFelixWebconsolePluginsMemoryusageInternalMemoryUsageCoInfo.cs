using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo
    /// </summary>
    public sealed class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo:  IEquatable<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo>
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
        public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo()
        {
        }

        private OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo(string Pid, string Title, string Description, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder</returns>
        public static OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder Builder()
        {
            return new OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder</returns>
        public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder With()
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

        public bool Equals(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo left, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo left, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        /// </summary>
        public sealed class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties _Properties;

            internal OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoBuilder Properties(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
            /// </summary>
            /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo</returns>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo Build()
            {
                Validate();
                return new OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo(
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