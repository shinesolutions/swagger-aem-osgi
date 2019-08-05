using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo
    /// </summary>
    public sealed class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo:  IEquatable<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo>
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
        public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo()
        {
        }

        private ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo(string Pid, string Title, string Description, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder</returns>
        public static ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder Builder()
        {
            return new ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder</returns>
        public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder With()
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

        public bool Equals(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo left, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo left, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.
        /// </summary>
        public sealed class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties _Properties;

            internal ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoBuilder Properties(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.
            /// </summary>
            /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo</returns>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo Build()
            {
                Validate();
                return new ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo(
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