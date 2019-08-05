using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddProcessINDDMediaExtractProcessInfo
    /// </summary>
    public sealed class ComDayCqDamInddProcessINDDMediaExtractProcessInfo:  IEquatable<ComDayCqDamInddProcessINDDMediaExtractProcessInfo>
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
        public ComDayCqDamInddProcessINDDMediaExtractProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddProcessINDDMediaExtractProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddProcessINDDMediaExtractProcessInfo()
        {
        }

        private ComDayCqDamInddProcessINDDMediaExtractProcessInfo(string Pid, string Title, string Description, ComDayCqDamInddProcessINDDMediaExtractProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddProcessINDDMediaExtractProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder</returns>
        public static ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder Builder()
        {
            return new ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder</returns>
        public ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamInddProcessINDDMediaExtractProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddProcessINDDMediaExtractProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddProcessINDDMediaExtractProcessInfo left, ComDayCqDamInddProcessINDDMediaExtractProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddProcessINDDMediaExtractProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddProcessINDDMediaExtractProcessInfo left, ComDayCqDamInddProcessINDDMediaExtractProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddProcessINDDMediaExtractProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamInddProcessINDDMediaExtractProcessProperties _Properties;

            internal ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessInfoBuilder Properties(ComDayCqDamInddProcessINDDMediaExtractProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddProcessINDDMediaExtractProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessInfo</returns>
            public ComDayCqDamInddProcessINDDMediaExtractProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamInddProcessINDDMediaExtractProcessInfo(
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