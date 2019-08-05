using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo
    /// </summary>
    public sealed class OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo:  IEquatable<OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo>
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
        public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo()
        {
        }

        private OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo(string Pid, string Title, string Description, OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder</returns>
        public static OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder Builder()
        {
            return new OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder</returns>
        public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo left, OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo left, OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties _Properties;

            internal OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoBuilder Properties(OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo</returns>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo(
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