using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo:  IEquatable<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo>
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
        public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo()
        {
        }

        private OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder</returns>
        public static OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder</returns>
        public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo left, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo left, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties _Properties;

            internal OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoBuilder Properties(OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo</returns>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(
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