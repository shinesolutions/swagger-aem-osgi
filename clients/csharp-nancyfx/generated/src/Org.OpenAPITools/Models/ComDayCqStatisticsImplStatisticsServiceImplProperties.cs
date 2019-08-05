using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqStatisticsImplStatisticsServiceImplProperties
    /// </summary>
    public sealed class ComDayCqStatisticsImplStatisticsServiceImplProperties:  IEquatable<ComDayCqStatisticsImplStatisticsServiceImplProperties>
    { 
        /// <summary>
        /// SchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger SchedulerPeriod { get; private set; }

        /// <summary>
        /// SchedulerConcurrent
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; private set; }

        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// Workspace
        /// </summary>
        public ConfigNodePropertyString Workspace { get; private set; }

        /// <summary>
        /// KeywordsPath
        /// </summary>
        public ConfigNodePropertyString KeywordsPath { get; private set; }

        /// <summary>
        /// AsyncEntries
        /// </summary>
        public ConfigNodePropertyBoolean AsyncEntries { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqStatisticsImplStatisticsServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqStatisticsImplStatisticsServiceImplProperties()
        {
        }

        private ComDayCqStatisticsImplStatisticsServiceImplProperties(ConfigNodePropertyInteger SchedulerPeriod, ConfigNodePropertyBoolean SchedulerConcurrent, ConfigNodePropertyString Path, ConfigNodePropertyString Workspace, ConfigNodePropertyString KeywordsPath, ConfigNodePropertyBoolean AsyncEntries)
        {
            
            this.SchedulerPeriod = SchedulerPeriod;
            
            this.SchedulerConcurrent = SchedulerConcurrent;
            
            this.Path = Path;
            
            this.Workspace = Workspace;
            
            this.KeywordsPath = KeywordsPath;
            
            this.AsyncEntries = AsyncEntries;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqStatisticsImplStatisticsServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder</returns>
        public static ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder</returns>
        public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder With()
        {
            return Builder()
                .SchedulerPeriod(SchedulerPeriod)
                .SchedulerConcurrent(SchedulerConcurrent)
                .Path(Path)
                .Workspace(Workspace)
                .KeywordsPath(KeywordsPath)
                .AsyncEntries(AsyncEntries);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqStatisticsImplStatisticsServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqStatisticsImplStatisticsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqStatisticsImplStatisticsServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqStatisticsImplStatisticsServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqStatisticsImplStatisticsServiceImplProperties left, ComDayCqStatisticsImplStatisticsServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqStatisticsImplStatisticsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqStatisticsImplStatisticsServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqStatisticsImplStatisticsServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqStatisticsImplStatisticsServiceImplProperties left, ComDayCqStatisticsImplStatisticsServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqStatisticsImplStatisticsServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SchedulerPeriod;
            private ConfigNodePropertyBoolean _SchedulerConcurrent;
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _Workspace;
            private ConfigNodePropertyString _KeywordsPath;
            private ConfigNodePropertyBoolean _AsyncEntries;

            internal ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.SchedulerPeriod property.
            /// </summary>
            /// <param name="value">SchedulerPeriod</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder SchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _SchedulerPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.SchedulerConcurrent property.
            /// </summary>
            /// <param name="value">SchedulerConcurrent</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder SchedulerConcurrent(ConfigNodePropertyBoolean value)
            {
                _SchedulerConcurrent = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.Workspace property.
            /// </summary>
            /// <param name="value">Workspace</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder Workspace(ConfigNodePropertyString value)
            {
                _Workspace = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.KeywordsPath property.
            /// </summary>
            /// <param name="value">KeywordsPath</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder KeywordsPath(ConfigNodePropertyString value)
            {
                _KeywordsPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplProperties.AsyncEntries property.
            /// </summary>
            /// <param name="value">AsyncEntries</param>
            public ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder AsyncEntries(ConfigNodePropertyBoolean value)
            {
                _AsyncEntries = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqStatisticsImplStatisticsServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqStatisticsImplStatisticsServiceImplProperties</returns>
            public ComDayCqStatisticsImplStatisticsServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqStatisticsImplStatisticsServiceImplProperties(
                    SchedulerPeriod: _SchedulerPeriod,
                    SchedulerConcurrent: _SchedulerConcurrent,
                    Path: _Path,
                    Workspace: _Workspace,
                    KeywordsPath: _KeywordsPath,
                    AsyncEntries: _AsyncEntries
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}