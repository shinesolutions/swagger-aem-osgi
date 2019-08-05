using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties>
    { 
        /// <summary>
        /// CqWcmMsmActionExcludednodetypes
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes { get; private set; }

        /// <summary>
        /// CqWcmMsmActionExcludedparagraphitems
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems { get; private set; }

        /// <summary>
        /// CqWcmMsmActionExcludedprops
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludedprops { get; private set; }

        /// <summary>
        /// CqWcmMsmImplActionReferencesupdatePropUpdateNested
        /// </summary>
        public ConfigNodePropertyBoolean CqWcmMsmImplActionReferencesupdatePropUpdateNested { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops, ConfigNodePropertyBoolean CqWcmMsmImplActionReferencesupdatePropUpdateNested)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
            this.CqWcmMsmImplActionReferencesupdatePropUpdateNested = CqWcmMsmImplActionReferencesupdatePropUpdateNested;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops)
                .CqWcmMsmImplActionReferencesupdatePropUpdateNested(CqWcmMsmImplActionReferencesupdatePropUpdateNested);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties left, ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties left, ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;
            private ConfigNodePropertyBoolean _CqWcmMsmImplActionReferencesupdatePropUpdateNested;

            internal ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.CqWcmMsmImplActionReferencesupdatePropUpdateNested property.
            /// </summary>
            /// <param name="value">CqWcmMsmImplActionReferencesupdatePropUpdateNested</param>
            public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesBuilder CqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean value)
            {
                _CqWcmMsmImplActionReferencesupdatePropUpdateNested = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops,
                    CqWcmMsmImplActionReferencesupdatePropUpdateNested: _CqWcmMsmImplActionReferencesupdatePropUpdateNested
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}