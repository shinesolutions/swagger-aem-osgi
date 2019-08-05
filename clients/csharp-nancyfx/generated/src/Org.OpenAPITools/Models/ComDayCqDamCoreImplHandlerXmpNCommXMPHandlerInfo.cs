using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo:  IEquatable<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo>
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
        public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo()
        {
        }

        private ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder</returns>
        public static ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder</returns>
        public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo left, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo left, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties _Properties;

            internal ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoBuilder Properties(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo</returns>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo(
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