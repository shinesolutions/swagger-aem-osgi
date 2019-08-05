using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo:  IEquatable<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo>
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
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo()
        {
        }

        private OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder</returns>
        public static OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder</returns>
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo left, OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo left, OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties _Properties;

            internal OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoBuilder Properties(OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo</returns>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo(
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