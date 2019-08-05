using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCreateAssetServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCreateAssetServletInfo:  IEquatable<ComDayCqDamCoreImplServletCreateAssetServletInfo>
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
        public ComDayCqDamCoreImplServletCreateAssetServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCreateAssetServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCreateAssetServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletCreateAssetServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletCreateAssetServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCreateAssetServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletCreateAssetServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCreateAssetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCreateAssetServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCreateAssetServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCreateAssetServletInfo left, ComDayCqDamCoreImplServletCreateAssetServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCreateAssetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCreateAssetServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCreateAssetServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCreateAssetServletInfo left, ComDayCqDamCoreImplServletCreateAssetServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCreateAssetServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletCreateAssetServletProperties _Properties;

            internal ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCreateAssetServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCreateAssetServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCreateAssetServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCreateAssetServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletCreateAssetServletInfoBuilder Properties(ComDayCqDamCoreImplServletCreateAssetServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCreateAssetServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCreateAssetServletInfo</returns>
            public ComDayCqDamCoreImplServletCreateAssetServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCreateAssetServletInfo(
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