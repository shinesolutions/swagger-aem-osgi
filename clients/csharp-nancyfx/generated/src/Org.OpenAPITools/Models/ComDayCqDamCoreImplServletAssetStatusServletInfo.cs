using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetStatusServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetStatusServletInfo:  IEquatable<ComDayCqDamCoreImplServletAssetStatusServletInfo>
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
        public ComDayCqDamCoreImplServletAssetStatusServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletAssetStatusServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetStatusServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletAssetStatusServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletAssetStatusServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetStatusServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletAssetStatusServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetStatusServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetStatusServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetStatusServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetStatusServletInfo left, ComDayCqDamCoreImplServletAssetStatusServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetStatusServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetStatusServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetStatusServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetStatusServletInfo left, ComDayCqDamCoreImplServletAssetStatusServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetStatusServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletAssetStatusServletProperties _Properties;

            internal ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetStatusServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetStatusServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetStatusServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetStatusServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletAssetStatusServletInfoBuilder Properties(ComDayCqDamCoreImplServletAssetStatusServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetStatusServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetStatusServletInfo</returns>
            public ComDayCqDamCoreImplServletAssetStatusServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetStatusServletInfo(
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