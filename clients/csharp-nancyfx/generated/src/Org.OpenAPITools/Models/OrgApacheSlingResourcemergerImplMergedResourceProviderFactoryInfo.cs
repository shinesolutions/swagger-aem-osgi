using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo:  IEquatable<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo>
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
        public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo()
        {
        }

        private OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder</returns>
        public static OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder</returns>
        public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo left, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo left, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties _Properties;

            internal OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoBuilder Properties(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo</returns>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(
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