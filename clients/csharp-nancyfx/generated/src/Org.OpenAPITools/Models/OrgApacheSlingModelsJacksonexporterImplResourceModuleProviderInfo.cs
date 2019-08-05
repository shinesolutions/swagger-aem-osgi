using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo
    /// </summary>
    public sealed class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo:  IEquatable<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo>
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
        public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo()
        {
        }

        private OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo(string Pid, string Title, string Description, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.
        /// </summary>
        /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder</returns>
        public static OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder Builder()
        {
            return new OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder</returns>
        public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder With()
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

        public bool Equals(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo left, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo left, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.
        /// </summary>
        public sealed class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties _Properties;

            internal OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoBuilder Properties(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.
            /// </summary>
            /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo</returns>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo Build()
            {
                Validate();
                return new OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo(
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