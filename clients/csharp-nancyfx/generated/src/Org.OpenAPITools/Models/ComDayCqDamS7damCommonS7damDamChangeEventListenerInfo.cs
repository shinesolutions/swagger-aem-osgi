using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo:  IEquatable<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo>
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
        public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo()
        {
        }

        private ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder</returns>
        public static ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder</returns>
        public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo left, ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo left, ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties _Properties;

            internal ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder Properties(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo</returns>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(
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