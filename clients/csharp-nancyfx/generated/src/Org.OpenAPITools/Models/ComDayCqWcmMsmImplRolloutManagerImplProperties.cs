using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplRolloutManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplRolloutManagerImplProperties:  IEquatable<ComDayCqWcmMsmImplRolloutManagerImplProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// RolloutmgrExcludedpropsDefault
        /// </summary>
        public ConfigNodePropertyArray RolloutmgrExcludedpropsDefault { get; private set; }

        /// <summary>
        /// RolloutmgrExcludedparagraphpropsDefault
        /// </summary>
        public ConfigNodePropertyArray RolloutmgrExcludedparagraphpropsDefault { get; private set; }

        /// <summary>
        /// RolloutmgrExcludednodetypesDefault
        /// </summary>
        public ConfigNodePropertyArray RolloutmgrExcludednodetypesDefault { get; private set; }

        /// <summary>
        /// RolloutmgrThreadpoolMaxsize
        /// </summary>
        public ConfigNodePropertyInteger RolloutmgrThreadpoolMaxsize { get; private set; }

        /// <summary>
        /// RolloutmgrThreadpoolMaxshutdowntime
        /// </summary>
        public ConfigNodePropertyInteger RolloutmgrThreadpoolMaxshutdowntime { get; private set; }

        /// <summary>
        /// RolloutmgrThreadpoolPriority
        /// </summary>
        public ConfigNodePropertyDropDown RolloutmgrThreadpoolPriority { get; private set; }

        /// <summary>
        /// RolloutmgrCommitSize
        /// </summary>
        public ConfigNodePropertyInteger RolloutmgrCommitSize { get; private set; }

        /// <summary>
        /// RolloutmgrConflicthandlingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean RolloutmgrConflicthandlingEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplRolloutManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplRolloutManagerImplProperties()
        {
        }

        private ComDayCqWcmMsmImplRolloutManagerImplProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyArray RolloutmgrExcludedpropsDefault, ConfigNodePropertyArray RolloutmgrExcludedparagraphpropsDefault, ConfigNodePropertyArray RolloutmgrExcludednodetypesDefault, ConfigNodePropertyInteger RolloutmgrThreadpoolMaxsize, ConfigNodePropertyInteger RolloutmgrThreadpoolMaxshutdowntime, ConfigNodePropertyDropDown RolloutmgrThreadpoolPriority, ConfigNodePropertyInteger RolloutmgrCommitSize, ConfigNodePropertyBoolean RolloutmgrConflicthandlingEnabled)
        {
            
            this.EventFilter = EventFilter;
            
            this.RolloutmgrExcludedpropsDefault = RolloutmgrExcludedpropsDefault;
            
            this.RolloutmgrExcludedparagraphpropsDefault = RolloutmgrExcludedparagraphpropsDefault;
            
            this.RolloutmgrExcludednodetypesDefault = RolloutmgrExcludednodetypesDefault;
            
            this.RolloutmgrThreadpoolMaxsize = RolloutmgrThreadpoolMaxsize;
            
            this.RolloutmgrThreadpoolMaxshutdowntime = RolloutmgrThreadpoolMaxshutdowntime;
            
            this.RolloutmgrThreadpoolPriority = RolloutmgrThreadpoolPriority;
            
            this.RolloutmgrCommitSize = RolloutmgrCommitSize;
            
            this.RolloutmgrConflicthandlingEnabled = RolloutmgrConflicthandlingEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplRolloutManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
                .RolloutmgrExcludedpropsDefault(RolloutmgrExcludedpropsDefault)
                .RolloutmgrExcludedparagraphpropsDefault(RolloutmgrExcludedparagraphpropsDefault)
                .RolloutmgrExcludednodetypesDefault(RolloutmgrExcludednodetypesDefault)
                .RolloutmgrThreadpoolMaxsize(RolloutmgrThreadpoolMaxsize)
                .RolloutmgrThreadpoolMaxshutdowntime(RolloutmgrThreadpoolMaxshutdowntime)
                .RolloutmgrThreadpoolPriority(RolloutmgrThreadpoolPriority)
                .RolloutmgrCommitSize(RolloutmgrCommitSize)
                .RolloutmgrConflicthandlingEnabled(RolloutmgrConflicthandlingEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplRolloutManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplRolloutManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplRolloutManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplRolloutManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplRolloutManagerImplProperties left, ComDayCqWcmMsmImplRolloutManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplRolloutManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplRolloutManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplRolloutManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplRolloutManagerImplProperties left, ComDayCqWcmMsmImplRolloutManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplRolloutManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyArray _RolloutmgrExcludedpropsDefault;
            private ConfigNodePropertyArray _RolloutmgrExcludedparagraphpropsDefault;
            private ConfigNodePropertyArray _RolloutmgrExcludednodetypesDefault;
            private ConfigNodePropertyInteger _RolloutmgrThreadpoolMaxsize;
            private ConfigNodePropertyInteger _RolloutmgrThreadpoolMaxshutdowntime;
            private ConfigNodePropertyDropDown _RolloutmgrThreadpoolPriority;
            private ConfigNodePropertyInteger _RolloutmgrCommitSize;
            private ConfigNodePropertyBoolean _RolloutmgrConflicthandlingEnabled;

            internal ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrExcludedpropsDefault property.
            /// </summary>
            /// <param name="value">RolloutmgrExcludedpropsDefault</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrExcludedpropsDefault(ConfigNodePropertyArray value)
            {
                _RolloutmgrExcludedpropsDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrExcludedparagraphpropsDefault property.
            /// </summary>
            /// <param name="value">RolloutmgrExcludedparagraphpropsDefault</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray value)
            {
                _RolloutmgrExcludedparagraphpropsDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrExcludednodetypesDefault property.
            /// </summary>
            /// <param name="value">RolloutmgrExcludednodetypesDefault</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray value)
            {
                _RolloutmgrExcludednodetypesDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrThreadpoolMaxsize property.
            /// </summary>
            /// <param name="value">RolloutmgrThreadpoolMaxsize</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger value)
            {
                _RolloutmgrThreadpoolMaxsize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrThreadpoolMaxshutdowntime property.
            /// </summary>
            /// <param name="value">RolloutmgrThreadpoolMaxshutdowntime</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger value)
            {
                _RolloutmgrThreadpoolMaxshutdowntime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrThreadpoolPriority property.
            /// </summary>
            /// <param name="value">RolloutmgrThreadpoolPriority</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown value)
            {
                _RolloutmgrThreadpoolPriority = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrCommitSize property.
            /// </summary>
            /// <param name="value">RolloutmgrCommitSize</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrCommitSize(ConfigNodePropertyInteger value)
            {
                _RolloutmgrCommitSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplRolloutManagerImplProperties.RolloutmgrConflicthandlingEnabled property.
            /// </summary>
            /// <param name="value">RolloutmgrConflicthandlingEnabled</param>
            public ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder RolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean value)
            {
                _RolloutmgrConflicthandlingEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplRolloutManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplRolloutManagerImplProperties</returns>
            public ComDayCqWcmMsmImplRolloutManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplRolloutManagerImplProperties(
                    EventFilter: _EventFilter,
                    RolloutmgrExcludedpropsDefault: _RolloutmgrExcludedpropsDefault,
                    RolloutmgrExcludedparagraphpropsDefault: _RolloutmgrExcludedparagraphpropsDefault,
                    RolloutmgrExcludednodetypesDefault: _RolloutmgrExcludednodetypesDefault,
                    RolloutmgrThreadpoolMaxsize: _RolloutmgrThreadpoolMaxsize,
                    RolloutmgrThreadpoolMaxshutdowntime: _RolloutmgrThreadpoolMaxshutdowntime,
                    RolloutmgrThreadpoolPriority: _RolloutmgrThreadpoolPriority,
                    RolloutmgrCommitSize: _RolloutmgrCommitSize,
                    RolloutmgrConflicthandlingEnabled: _RolloutmgrConflicthandlingEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}