using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties>
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
        /// CqWcmMsmImplActionsPagemovePropReferenceUpdate
        /// </summary>
        public ConfigNodePropertyBoolean CqWcmMsmImplActionsPagemovePropReferenceUpdate { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops, ConfigNodePropertyBoolean CqWcmMsmImplActionsPagemovePropReferenceUpdate)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
            this.CqWcmMsmImplActionsPagemovePropReferenceUpdate = CqWcmMsmImplActionsPagemovePropReferenceUpdate;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops)
                .CqWcmMsmImplActionsPagemovePropReferenceUpdate(CqWcmMsmImplActionsPagemovePropReferenceUpdate);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties left, ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties left, ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;
            private ConfigNodePropertyBoolean _CqWcmMsmImplActionsPagemovePropReferenceUpdate;

            internal ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.CqWcmMsmImplActionsPagemovePropReferenceUpdate property.
            /// </summary>
            /// <param name="value">CqWcmMsmImplActionsPagemovePropReferenceUpdate</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder CqWcmMsmImplActionsPagemovePropReferenceUpdate(ConfigNodePropertyBoolean value)
            {
                _CqWcmMsmImplActionsPagemovePropReferenceUpdate = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops,
                    CqWcmMsmImplActionsPagemovePropReferenceUpdate: _CqWcmMsmImplActionsPagemovePropReferenceUpdate
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}