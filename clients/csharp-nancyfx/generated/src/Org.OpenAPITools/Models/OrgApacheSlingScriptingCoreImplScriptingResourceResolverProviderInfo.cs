using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo
    /// </summary>
    public sealed class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo:  IEquatable<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo>
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
        public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo()
        {
        }

        private OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo(string Pid, string Title, string Description, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder</returns>
        public static OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder Builder()
        {
            return new OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder</returns>
        public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder With()
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

        public bool Equals(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo left, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo left, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.
        /// </summary>
        public sealed class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties _Properties;

            internal OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoBuilder Properties(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo</returns>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo Build()
            {
                Validate();
                return new OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo(
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