using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCommonsHttpclientInfo
    /// </summary>
    public sealed class ComDayCommonsHttpclientInfo:  IEquatable<ComDayCommonsHttpclientInfo>
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
        public ComDayCommonsHttpclientProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCommonsHttpclientInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCommonsHttpclientInfo()
        {
        }

        private ComDayCommonsHttpclientInfo(string Pid, string Title, string Description, ComDayCommonsHttpclientProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCommonsHttpclientInfo.
        /// </summary>
        /// <returns>ComDayCommonsHttpclientInfoBuilder</returns>
        public static ComDayCommonsHttpclientInfoBuilder Builder()
        {
            return new ComDayCommonsHttpclientInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCommonsHttpclientInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCommonsHttpclientInfoBuilder</returns>
        public ComDayCommonsHttpclientInfoBuilder With()
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

        public bool Equals(ComDayCommonsHttpclientInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCommonsHttpclientInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsHttpclientInfo</param>
        /// <param name="right">Compared (ComDayCommonsHttpclientInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCommonsHttpclientInfo left, ComDayCommonsHttpclientInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCommonsHttpclientInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsHttpclientInfo</param>
        /// <param name="right">Compared (ComDayCommonsHttpclientInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCommonsHttpclientInfo left, ComDayCommonsHttpclientInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCommonsHttpclientInfo.
        /// </summary>
        public sealed class ComDayCommonsHttpclientInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCommonsHttpclientProperties _Properties;

            internal ComDayCommonsHttpclientInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCommonsHttpclientInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCommonsHttpclientInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCommonsHttpclientInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCommonsHttpclientInfoBuilder Properties(ComDayCommonsHttpclientProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCommonsHttpclientInfo.
            /// </summary>
            /// <returns>ComDayCommonsHttpclientInfo</returns>
            public ComDayCommonsHttpclientInfo Build()
            {
                Validate();
                return new ComDayCommonsHttpclientInfo(
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