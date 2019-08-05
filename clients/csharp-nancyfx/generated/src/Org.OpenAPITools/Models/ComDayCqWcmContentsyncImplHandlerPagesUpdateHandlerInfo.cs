using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo
    /// </summary>
    public sealed class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo:  IEquatable<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo>
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
        public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo()
        {
        }

        private ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo(string Pid, string Title, string Description, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder</returns>
        public static ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder Builder()
        {
            return new ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder</returns>
        public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo left, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo left, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.
        /// </summary>
        public sealed class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties _Properties;

            internal ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoBuilder Properties(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo</returns>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo Build()
            {
                Validate();
                return new ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo(
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