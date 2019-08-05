using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamChangeEventListenerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamChangeEventListenerInfo:  IEquatable<ComDayCqDamCoreImplDamChangeEventListenerInfo>
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
        public ComDayCqDamCoreImplDamChangeEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamChangeEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamChangeEventListenerInfo()
        {
        }

        private ComDayCqDamCoreImplDamChangeEventListenerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplDamChangeEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamChangeEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder</returns>
        public static ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder</returns>
        public ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplDamChangeEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamChangeEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamChangeEventListenerInfo left, ComDayCqDamCoreImplDamChangeEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamChangeEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamChangeEventListenerInfo left, ComDayCqDamCoreImplDamChangeEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamChangeEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplDamChangeEventListenerProperties _Properties;

            internal ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamChangeEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamChangeEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamChangeEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamChangeEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplDamChangeEventListenerInfoBuilder Properties(ComDayCqDamCoreImplDamChangeEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamChangeEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamChangeEventListenerInfo</returns>
            public ComDayCqDamCoreImplDamChangeEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamChangeEventListenerInfo(
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