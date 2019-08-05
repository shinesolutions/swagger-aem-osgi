using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletBinaryProviderServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletBinaryProviderServletInfo:  IEquatable<ComDayCqDamCoreImplServletBinaryProviderServletInfo>
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
        public ComDayCqDamCoreImplServletBinaryProviderServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletBinaryProviderServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletBinaryProviderServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletBinaryProviderServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletBinaryProviderServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletBinaryProviderServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletBinaryProviderServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletBinaryProviderServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBinaryProviderServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBinaryProviderServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletBinaryProviderServletInfo left, ComDayCqDamCoreImplServletBinaryProviderServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletBinaryProviderServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBinaryProviderServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBinaryProviderServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletBinaryProviderServletInfo left, ComDayCqDamCoreImplServletBinaryProviderServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletBinaryProviderServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletBinaryProviderServletProperties _Properties;

            internal ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletInfoBuilder Properties(ComDayCqDamCoreImplServletBinaryProviderServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletBinaryProviderServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletInfo</returns>
            public ComDayCqDamCoreImplServletBinaryProviderServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletBinaryProviderServletInfo(
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