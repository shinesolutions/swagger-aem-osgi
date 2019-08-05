using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo:  IEquatable<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo>
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
        public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo()
        {
        }

        private ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder</returns>
        public static ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder</returns>
        public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo left, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo left, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties _Properties;

            internal ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder Properties(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo</returns>
            public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(
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