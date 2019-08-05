using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties>
    { 
        /// <summary>
        /// PathDescField
        /// </summary>
        public ConfigNodePropertyString PathDescField { get; private set; }

        /// <summary>
        /// PathChildField
        /// </summary>
        public ConfigNodePropertyString PathChildField { get; private set; }

        /// <summary>
        /// PathParentField
        /// </summary>
        public ConfigNodePropertyString PathParentField { get; private set; }

        /// <summary>
        /// PathExactField
        /// </summary>
        public ConfigNodePropertyString PathExactField { get; private set; }

        /// <summary>
        /// CatchAllField
        /// </summary>
        public ConfigNodePropertyString CatchAllField { get; private set; }

        /// <summary>
        /// CollapsedPathField
        /// </summary>
        public ConfigNodePropertyString CollapsedPathField { get; private set; }

        /// <summary>
        /// PathDepthField
        /// </summary>
        public ConfigNodePropertyString PathDepthField { get; private set; }

        /// <summary>
        /// CommitPolicy
        /// </summary>
        public ConfigNodePropertyDropDown CommitPolicy { get; private set; }

        /// <summary>
        /// Rows
        /// </summary>
        public ConfigNodePropertyInteger Rows { get; private set; }

        /// <summary>
        /// PathRestrictions
        /// </summary>
        public ConfigNodePropertyBoolean PathRestrictions { get; private set; }

        /// <summary>
        /// PropertyRestrictions
        /// </summary>
        public ConfigNodePropertyBoolean PropertyRestrictions { get; private set; }

        /// <summary>
        /// PrimarytypesRestrictions
        /// </summary>
        public ConfigNodePropertyBoolean PrimarytypesRestrictions { get; private set; }

        /// <summary>
        /// IgnoredProperties
        /// </summary>
        public ConfigNodePropertyArray IgnoredProperties { get; private set; }

        /// <summary>
        /// UsedProperties
        /// </summary>
        public ConfigNodePropertyArray UsedProperties { get; private set; }

        /// <summary>
        /// TypeMappings
        /// </summary>
        public ConfigNodePropertyArray TypeMappings { get; private set; }

        /// <summary>
        /// PropertyMappings
        /// </summary>
        public ConfigNodePropertyArray PropertyMappings { get; private set; }

        /// <summary>
        /// CollapseJcrcontentNodes
        /// </summary>
        public ConfigNodePropertyBoolean CollapseJcrcontentNodes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(ConfigNodePropertyString PathDescField, ConfigNodePropertyString PathChildField, ConfigNodePropertyString PathParentField, ConfigNodePropertyString PathExactField, ConfigNodePropertyString CatchAllField, ConfigNodePropertyString CollapsedPathField, ConfigNodePropertyString PathDepthField, ConfigNodePropertyDropDown CommitPolicy, ConfigNodePropertyInteger Rows, ConfigNodePropertyBoolean PathRestrictions, ConfigNodePropertyBoolean PropertyRestrictions, ConfigNodePropertyBoolean PrimarytypesRestrictions, ConfigNodePropertyArray IgnoredProperties, ConfigNodePropertyArray UsedProperties, ConfigNodePropertyArray TypeMappings, ConfigNodePropertyArray PropertyMappings, ConfigNodePropertyBoolean CollapseJcrcontentNodes)
        {
            
            this.PathDescField = PathDescField;
            
            this.PathChildField = PathChildField;
            
            this.PathParentField = PathParentField;
            
            this.PathExactField = PathExactField;
            
            this.CatchAllField = CatchAllField;
            
            this.CollapsedPathField = CollapsedPathField;
            
            this.PathDepthField = PathDepthField;
            
            this.CommitPolicy = CommitPolicy;
            
            this.Rows = Rows;
            
            this.PathRestrictions = PathRestrictions;
            
            this.PropertyRestrictions = PropertyRestrictions;
            
            this.PrimarytypesRestrictions = PrimarytypesRestrictions;
            
            this.IgnoredProperties = IgnoredProperties;
            
            this.UsedProperties = UsedProperties;
            
            this.TypeMappings = TypeMappings;
            
            this.PropertyMappings = PropertyMappings;
            
            this.CollapseJcrcontentNodes = CollapseJcrcontentNodes;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder With()
        {
            return Builder()
                .PathDescField(PathDescField)
                .PathChildField(PathChildField)
                .PathParentField(PathParentField)
                .PathExactField(PathExactField)
                .CatchAllField(CatchAllField)
                .CollapsedPathField(CollapsedPathField)
                .PathDepthField(PathDepthField)
                .CommitPolicy(CommitPolicy)
                .Rows(Rows)
                .PathRestrictions(PathRestrictions)
                .PropertyRestrictions(PropertyRestrictions)
                .PrimarytypesRestrictions(PrimarytypesRestrictions)
                .IgnoredProperties(IgnoredProperties)
                .UsedProperties(UsedProperties)
                .TypeMappings(TypeMappings)
                .PropertyMappings(PropertyMappings)
                .CollapseJcrcontentNodes(CollapseJcrcontentNodes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyString _PathDescField;
            private ConfigNodePropertyString _PathChildField;
            private ConfigNodePropertyString _PathParentField;
            private ConfigNodePropertyString _PathExactField;
            private ConfigNodePropertyString _CatchAllField;
            private ConfigNodePropertyString _CollapsedPathField;
            private ConfigNodePropertyString _PathDepthField;
            private ConfigNodePropertyDropDown _CommitPolicy;
            private ConfigNodePropertyInteger _Rows;
            private ConfigNodePropertyBoolean _PathRestrictions;
            private ConfigNodePropertyBoolean _PropertyRestrictions;
            private ConfigNodePropertyBoolean _PrimarytypesRestrictions;
            private ConfigNodePropertyArray _IgnoredProperties;
            private ConfigNodePropertyArray _UsedProperties;
            private ConfigNodePropertyArray _TypeMappings;
            private ConfigNodePropertyArray _PropertyMappings;
            private ConfigNodePropertyBoolean _CollapseJcrcontentNodes;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathDescField property.
            /// </summary>
            /// <param name="value">PathDescField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathDescField(ConfigNodePropertyString value)
            {
                _PathDescField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathChildField property.
            /// </summary>
            /// <param name="value">PathChildField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathChildField(ConfigNodePropertyString value)
            {
                _PathChildField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathParentField property.
            /// </summary>
            /// <param name="value">PathParentField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathParentField(ConfigNodePropertyString value)
            {
                _PathParentField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathExactField property.
            /// </summary>
            /// <param name="value">PathExactField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathExactField(ConfigNodePropertyString value)
            {
                _PathExactField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.CatchAllField property.
            /// </summary>
            /// <param name="value">CatchAllField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder CatchAllField(ConfigNodePropertyString value)
            {
                _CatchAllField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.CollapsedPathField property.
            /// </summary>
            /// <param name="value">CollapsedPathField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder CollapsedPathField(ConfigNodePropertyString value)
            {
                _CollapsedPathField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathDepthField property.
            /// </summary>
            /// <param name="value">PathDepthField</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathDepthField(ConfigNodePropertyString value)
            {
                _PathDepthField = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.CommitPolicy property.
            /// </summary>
            /// <param name="value">CommitPolicy</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder CommitPolicy(ConfigNodePropertyDropDown value)
            {
                _CommitPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.Rows property.
            /// </summary>
            /// <param name="value">Rows</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder Rows(ConfigNodePropertyInteger value)
            {
                _Rows = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PathRestrictions property.
            /// </summary>
            /// <param name="value">PathRestrictions</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PathRestrictions(ConfigNodePropertyBoolean value)
            {
                _PathRestrictions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PropertyRestrictions property.
            /// </summary>
            /// <param name="value">PropertyRestrictions</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PropertyRestrictions(ConfigNodePropertyBoolean value)
            {
                _PropertyRestrictions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PrimarytypesRestrictions property.
            /// </summary>
            /// <param name="value">PrimarytypesRestrictions</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PrimarytypesRestrictions(ConfigNodePropertyBoolean value)
            {
                _PrimarytypesRestrictions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.IgnoredProperties property.
            /// </summary>
            /// <param name="value">IgnoredProperties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder IgnoredProperties(ConfigNodePropertyArray value)
            {
                _IgnoredProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.UsedProperties property.
            /// </summary>
            /// <param name="value">UsedProperties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder UsedProperties(ConfigNodePropertyArray value)
            {
                _UsedProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.TypeMappings property.
            /// </summary>
            /// <param name="value">TypeMappings</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder TypeMappings(ConfigNodePropertyArray value)
            {
                _TypeMappings = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.PropertyMappings property.
            /// </summary>
            /// <param name="value">PropertyMappings</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder PropertyMappings(ConfigNodePropertyArray value)
            {
                _PropertyMappings = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.CollapseJcrcontentNodes property.
            /// </summary>
            /// <param name="value">CollapseJcrcontentNodes</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder CollapseJcrcontentNodes(ConfigNodePropertyBoolean value)
            {
                _CollapseJcrcontentNodes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(
                    PathDescField: _PathDescField,
                    PathChildField: _PathChildField,
                    PathParentField: _PathParentField,
                    PathExactField: _PathExactField,
                    CatchAllField: _CatchAllField,
                    CollapsedPathField: _CollapsedPathField,
                    PathDepthField: _PathDepthField,
                    CommitPolicy: _CommitPolicy,
                    Rows: _Rows,
                    PathRestrictions: _PathRestrictions,
                    PropertyRestrictions: _PropertyRestrictions,
                    PrimarytypesRestrictions: _PrimarytypesRestrictions,
                    IgnoredProperties: _IgnoredProperties,
                    UsedProperties: _UsedProperties,
                    TypeMappings: _TypeMappings,
                    PropertyMappings: _PropertyMappings,
                    CollapseJcrcontentNodes: _CollapseJcrcontentNodes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}