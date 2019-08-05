using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsGetDefaultGetServletProperties
    /// </summary>
    public sealed class OrgApacheSlingServletsGetDefaultGetServletProperties:  IEquatable<OrgApacheSlingServletsGetDefaultGetServletProperties>
    { 
        /// <summary>
        /// Aliases
        /// </summary>
        public ConfigNodePropertyArray Aliases { get; private set; }

        /// <summary>
        /// Index
        /// </summary>
        public ConfigNodePropertyBoolean Index { get; private set; }

        /// <summary>
        /// IndexFiles
        /// </summary>
        public ConfigNodePropertyArray IndexFiles { get; private set; }

        /// <summary>
        /// EnableHtml
        /// </summary>
        public ConfigNodePropertyBoolean EnableHtml { get; private set; }

        /// <summary>
        /// EnableJson
        /// </summary>
        public ConfigNodePropertyBoolean EnableJson { get; private set; }

        /// <summary>
        /// EnableTxt
        /// </summary>
        public ConfigNodePropertyBoolean EnableTxt { get; private set; }

        /// <summary>
        /// EnableXml
        /// </summary>
        public ConfigNodePropertyBoolean EnableXml { get; private set; }

        /// <summary>
        /// JsonMaximumresults
        /// </summary>
        public ConfigNodePropertyInteger JsonMaximumresults { get; private set; }

        /// <summary>
        /// EcmaSuport
        /// </summary>
        public ConfigNodePropertyBoolean EcmaSuport { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsGetDefaultGetServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsGetDefaultGetServletProperties()
        {
        }

        private OrgApacheSlingServletsGetDefaultGetServletProperties(ConfigNodePropertyArray Aliases, ConfigNodePropertyBoolean Index, ConfigNodePropertyArray IndexFiles, ConfigNodePropertyBoolean EnableHtml, ConfigNodePropertyBoolean EnableJson, ConfigNodePropertyBoolean EnableTxt, ConfigNodePropertyBoolean EnableXml, ConfigNodePropertyInteger JsonMaximumresults, ConfigNodePropertyBoolean EcmaSuport)
        {
            
            this.Aliases = Aliases;
            
            this.Index = Index;
            
            this.IndexFiles = IndexFiles;
            
            this.EnableHtml = EnableHtml;
            
            this.EnableJson = EnableJson;
            
            this.EnableTxt = EnableTxt;
            
            this.EnableXml = EnableXml;
            
            this.JsonMaximumresults = JsonMaximumresults;
            
            this.EcmaSuport = EcmaSuport;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsGetDefaultGetServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder</returns>
        public static OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder</returns>
        public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder With()
        {
            return Builder()
                .Aliases(Aliases)
                .Index(Index)
                .IndexFiles(IndexFiles)
                .EnableHtml(EnableHtml)
                .EnableJson(EnableJson)
                .EnableTxt(EnableTxt)
                .EnableXml(EnableXml)
                .JsonMaximumresults(JsonMaximumresults)
                .EcmaSuport(EcmaSuport);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServletsGetDefaultGetServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsGetDefaultGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetDefaultGetServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetDefaultGetServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsGetDefaultGetServletProperties left, OrgApacheSlingServletsGetDefaultGetServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsGetDefaultGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetDefaultGetServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetDefaultGetServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsGetDefaultGetServletProperties left, OrgApacheSlingServletsGetDefaultGetServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsGetDefaultGetServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _Aliases;
            private ConfigNodePropertyBoolean _Index;
            private ConfigNodePropertyArray _IndexFiles;
            private ConfigNodePropertyBoolean _EnableHtml;
            private ConfigNodePropertyBoolean _EnableJson;
            private ConfigNodePropertyBoolean _EnableTxt;
            private ConfigNodePropertyBoolean _EnableXml;
            private ConfigNodePropertyInteger _JsonMaximumresults;
            private ConfigNodePropertyBoolean _EcmaSuport;

            internal OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.Aliases property.
            /// </summary>
            /// <param name="value">Aliases</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder Aliases(ConfigNodePropertyArray value)
            {
                _Aliases = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.Index property.
            /// </summary>
            /// <param name="value">Index</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder Index(ConfigNodePropertyBoolean value)
            {
                _Index = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.IndexFiles property.
            /// </summary>
            /// <param name="value">IndexFiles</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder IndexFiles(ConfigNodePropertyArray value)
            {
                _IndexFiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.EnableHtml property.
            /// </summary>
            /// <param name="value">EnableHtml</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder EnableHtml(ConfigNodePropertyBoolean value)
            {
                _EnableHtml = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.EnableJson property.
            /// </summary>
            /// <param name="value">EnableJson</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder EnableJson(ConfigNodePropertyBoolean value)
            {
                _EnableJson = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.EnableTxt property.
            /// </summary>
            /// <param name="value">EnableTxt</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder EnableTxt(ConfigNodePropertyBoolean value)
            {
                _EnableTxt = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.EnableXml property.
            /// </summary>
            /// <param name="value">EnableXml</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder EnableXml(ConfigNodePropertyBoolean value)
            {
                _EnableXml = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.JsonMaximumresults property.
            /// </summary>
            /// <param name="value">JsonMaximumresults</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder JsonMaximumresults(ConfigNodePropertyInteger value)
            {
                _JsonMaximumresults = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletProperties.EcmaSuport property.
            /// </summary>
            /// <param name="value">EcmaSuport</param>
            public OrgApacheSlingServletsGetDefaultGetServletPropertiesBuilder EcmaSuport(ConfigNodePropertyBoolean value)
            {
                _EcmaSuport = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsGetDefaultGetServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServletsGetDefaultGetServletProperties</returns>
            public OrgApacheSlingServletsGetDefaultGetServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingServletsGetDefaultGetServletProperties(
                    Aliases: _Aliases,
                    Index: _Index,
                    IndexFiles: _IndexFiles,
                    EnableHtml: _EnableHtml,
                    EnableJson: _EnableJson,
                    EnableTxt: _EnableTxt,
                    EnableXml: _EnableXml,
                    JsonMaximumresults: _JsonMaximumresults,
                    EcmaSuport: _EcmaSuport
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}