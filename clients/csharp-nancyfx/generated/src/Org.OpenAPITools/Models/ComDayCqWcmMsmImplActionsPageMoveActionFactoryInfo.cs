using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo:  IEquatable<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo>
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
        public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo()
        {
        }

        private ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder</returns>
        public static ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder</returns>
        public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo left, ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo left, ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties _Properties;

            internal ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder Properties(ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo</returns>
            public ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo(
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