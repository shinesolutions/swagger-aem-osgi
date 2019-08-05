using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo:  IEquatable<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo>
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
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo()
        {
        }

        private OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder</returns>
        public static OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder</returns>
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo left, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo left, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties _Properties;

            internal OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoBuilder Properties(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo</returns>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo(
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