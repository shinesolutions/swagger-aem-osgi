using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVersionPurgeTaskInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVersionPurgeTaskInfo:  IEquatable<ComDayCqWcmCoreImplVersionPurgeTaskInfo>
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
        public ComDayCqWcmCoreImplVersionPurgeTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplVersionPurgeTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVersionPurgeTaskInfo()
        {
        }

        private ComDayCqWcmCoreImplVersionPurgeTaskInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplVersionPurgeTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVersionPurgeTaskInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder</returns>
        public static ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder</returns>
        public ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplVersionPurgeTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVersionPurgeTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionPurgeTaskInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionPurgeTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVersionPurgeTaskInfo left, ComDayCqWcmCoreImplVersionPurgeTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVersionPurgeTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionPurgeTaskInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionPurgeTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVersionPurgeTaskInfo left, ComDayCqWcmCoreImplVersionPurgeTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVersionPurgeTaskInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplVersionPurgeTaskProperties _Properties;

            internal ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskInfoBuilder Properties(ComDayCqWcmCoreImplVersionPurgeTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVersionPurgeTaskInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskInfo</returns>
            public ComDayCqWcmCoreImplVersionPurgeTaskInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVersionPurgeTaskInfo(
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