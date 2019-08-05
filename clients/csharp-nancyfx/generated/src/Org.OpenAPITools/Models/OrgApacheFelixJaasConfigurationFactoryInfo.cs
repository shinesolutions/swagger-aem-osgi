using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixJaasConfigurationFactoryInfo
    /// </summary>
    public sealed class OrgApacheFelixJaasConfigurationFactoryInfo:  IEquatable<OrgApacheFelixJaasConfigurationFactoryInfo>
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
        public OrgApacheFelixJaasConfigurationFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixJaasConfigurationFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixJaasConfigurationFactoryInfo()
        {
        }

        private OrgApacheFelixJaasConfigurationFactoryInfo(string Pid, string Title, string Description, OrgApacheFelixJaasConfigurationFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixJaasConfigurationFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationFactoryInfoBuilder</returns>
        public static OrgApacheFelixJaasConfigurationFactoryInfoBuilder Builder()
        {
            return new OrgApacheFelixJaasConfigurationFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixJaasConfigurationFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationFactoryInfoBuilder</returns>
        public OrgApacheFelixJaasConfigurationFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheFelixJaasConfigurationFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixJaasConfigurationFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixJaasConfigurationFactoryInfo left, OrgApacheFelixJaasConfigurationFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixJaasConfigurationFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixJaasConfigurationFactoryInfo left, OrgApacheFelixJaasConfigurationFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixJaasConfigurationFactoryInfo.
        /// </summary>
        public sealed class OrgApacheFelixJaasConfigurationFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixJaasConfigurationFactoryProperties _Properties;

            internal OrgApacheFelixJaasConfigurationFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixJaasConfigurationFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixJaasConfigurationFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixJaasConfigurationFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixJaasConfigurationFactoryInfoBuilder Properties(OrgApacheFelixJaasConfigurationFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixJaasConfigurationFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheFelixJaasConfigurationFactoryInfo</returns>
            public OrgApacheFelixJaasConfigurationFactoryInfo Build()
            {
                Validate();
                return new OrgApacheFelixJaasConfigurationFactoryInfo(
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