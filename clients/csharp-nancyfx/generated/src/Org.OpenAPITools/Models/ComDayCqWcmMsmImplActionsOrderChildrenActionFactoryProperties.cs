using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties>
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
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties left, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties left, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;

            internal ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}