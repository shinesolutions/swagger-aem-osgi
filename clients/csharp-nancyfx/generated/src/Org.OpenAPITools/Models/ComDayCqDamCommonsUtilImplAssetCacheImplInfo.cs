using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsUtilImplAssetCacheImplInfo
    /// </summary>
    public sealed class ComDayCqDamCommonsUtilImplAssetCacheImplInfo:  IEquatable<ComDayCqDamCommonsUtilImplAssetCacheImplInfo>
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
        public ComDayCqDamCommonsUtilImplAssetCacheImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsUtilImplAssetCacheImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsUtilImplAssetCacheImplInfo()
        {
        }

        private ComDayCqDamCommonsUtilImplAssetCacheImplInfo(string Pid, string Title, string Description, ComDayCqDamCommonsUtilImplAssetCacheImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsUtilImplAssetCacheImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder</returns>
        public static ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder Builder()
        {
            return new ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder</returns>
        public ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCommonsUtilImplAssetCacheImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsUtilImplAssetCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsUtilImplAssetCacheImplInfo left, ComDayCqDamCommonsUtilImplAssetCacheImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsUtilImplAssetCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsUtilImplAssetCacheImplInfo left, ComDayCqDamCommonsUtilImplAssetCacheImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsUtilImplAssetCacheImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCommonsUtilImplAssetCacheImplProperties _Properties;

            internal ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplInfoBuilder Properties(ComDayCqDamCommonsUtilImplAssetCacheImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsUtilImplAssetCacheImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplInfo</returns>
            public ComDayCqDamCommonsUtilImplAssetCacheImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCommonsUtilImplAssetCacheImplInfo(
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