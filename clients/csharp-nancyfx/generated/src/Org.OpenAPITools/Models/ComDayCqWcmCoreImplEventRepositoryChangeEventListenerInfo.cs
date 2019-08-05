using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo:  IEquatable<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo>
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
        public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo()
        {
        }

        private ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder</returns>
        public static ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder</returns>
        public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo left, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo left, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties _Properties;

            internal ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoBuilder Properties(ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo</returns>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo(
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